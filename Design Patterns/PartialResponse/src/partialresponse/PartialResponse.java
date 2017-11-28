/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partialresponse;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author maitrayshah
 */
public class PartialResponse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Map<Integer, Video> videos = new HashMap<>();
            videos.put(1, new Video(1, "Avatar", 178, "epic science fiction film", "James Cameron", "English"));
            videos.put(2, new Video(2, "Godzilla Resurgence", 120, "Action & drama movie|", "Hideaki Anno", "Japanese"));
            videos.put(3, new Video(3, "Interstellar", 169, "Adventure & Sci-Fi", "Christopher Nolan", "English"));
            
            VideoResource videoResource = new VideoResource(new FieldJsonMapper(), videos);
            
            
        
    }
    
}
