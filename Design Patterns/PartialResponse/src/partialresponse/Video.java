/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partialresponse;

/**
 *
 * @author maitrayshah
 */
public class Video {
    private final Integer id;
    private final String title;
    private final Integer length;
    private final String description;
    private final String director;
    private final String language;
    
    public Video(Integer id, String title, Integer length, String description, String director, String language) {
    this.id = id;
    this.title = title;
    this.length = length;
    this.description = description;
    this.director = director;
    this.language = language;
  }
    
    @Override
    public String toString()
    {
         return "{"
        + "\"id\": " + id + ","
        + "\"title\": \"" + title + "\","
        + "\"length\": " + length + ","
        + "\"description\": \"" + description + "\","
        + "\"director\": \"" + director + "\","
        + "\"language\": \"" + language + "\","
        + "}";
    }
}
