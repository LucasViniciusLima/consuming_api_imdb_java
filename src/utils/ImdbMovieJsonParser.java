package utils;

import domain.Atribute;
import domain.Content;
import domain.Movie;

import java.util.ArrayList;
import java.util.List;

public class ImdbMovieJsonParser implements JsonParser {

    private String json;

    public ImdbMovieJsonParser(String json){
        this.json = json;
    }

    public List<Content> parse(){
        int initOfDelimiter = this.json.indexOf("[");
        int endOfDelimiter = this.json.indexOf("]");

        String completeListStr = this.json.substring(initOfDelimiter,endOfDelimiter);
        List<Content> contentList = new ArrayList<>();

        String[] itemsList = completeListStr.split("[{}]");

        for(String item:itemsList){

            String[] atributes = item.split("\",");

            Content content = new Movie() ;

            for(String atr: atributes) {
                String[] arrAtribute = atr.replace("\"", "").split(":");

                if(arrAtribute.length >= 2) {

                    String atributeName = arrAtribute[0];
                    String atributeValue = arrAtribute[1];

                    if(arrAtribute.length == 3) atributeValue += ":" + arrAtribute[2];

                    try{
                        Atribute.valueOf(atributeName.toUpperCase()).setAtribute(content,atributeValue);

                    } catch(Exception ex){
                        //System.out.println("not an atribute required");
                    }

                }
            }

            if(content.getTitle() != null) contentList.add(content);
        }

        return contentList;
    }
}
