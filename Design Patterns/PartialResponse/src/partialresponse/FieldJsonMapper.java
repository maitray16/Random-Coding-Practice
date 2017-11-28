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
import java.lang.reflect.Field;

/**
 * Map a video to json
 */
public class FieldJsonMapper {

  /**
   * @param video  object containing video information
   * @param fields fields information to get
   * @return json of required fields from video
   */
  public String toJson(Video video, String[] fields) throws Exception {
    StringBuilder json = new StringBuilder().append("{");

    for (int i = 0, fieldsLength = fields.length; i < fieldsLength; i++) {
      json.append(getString(video, Video.class.getDeclaredField(fields[i])));
      if (i != fieldsLength - 1) {
        json.append(",");
      }
    }
    json.append("}");
    return json.toString();
  }

  private String getString(Video video, Field declaredField) throws IllegalAccessException {
    declaredField.setAccessible(true);
    Object value = declaredField.get(video);
    if (declaredField.get(video) instanceof Integer) {
      return "\"" + declaredField.getName() + "\"" + ": " + value;
    }
    return "\"" + declaredField.getName() + "\"" + ": " + "\"" + value.toString() + "\"";
  }
}