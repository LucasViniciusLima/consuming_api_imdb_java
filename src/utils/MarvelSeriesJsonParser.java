package utils;

import domain.Serie;
import java.util.List;


public class MarvelSeriesJsonParser implements JsonParser {

    private String json;
    public MarvelSeriesJsonParser(String json){
        this.json = json;
    }
    public List<Serie> parse(){


        //return new ArrayList<>();
    }
}
