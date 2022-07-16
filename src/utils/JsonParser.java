package utils;

import domain.Content;

import java.util.List;

public interface JsonParser {

    List<? extends Content> parse();

}
