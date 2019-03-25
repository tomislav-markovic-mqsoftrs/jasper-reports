package jasper.jasperreports.utils;

import java.io.File;
import java.lang.reflect.Type;

public class Functions {
  public static String fieldType(Type type){
      System.out.println(type.getTypeName());

      if(type.getTypeName() == "boolean"){
          return "java.lang.Boolean";
      }
      return type.getTypeName();
  }


}
