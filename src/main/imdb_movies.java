package main;

import domain.*;
import utils.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class imdb_movies {

    public static void main(String[] args) throws IOException, InterruptedException {
        String myKey = "k_4w2dm5vq";

        //String json = new ImdbApiClient(myKey).getBody();
        String json = new MarvelAPIClient(myKey).getBody();

        //List<Content> contentList = new ImdbMovieJsonParser(json).parse();
        List<? extends Content> contentList = new MarvelSeriesJsonParser(json).parse();

        PrintWriter printWriter = new PrintWriter("index.html");
        new HTMLGenerator(printWriter).generate(contentList);

        printWriter.close();
    }

}
