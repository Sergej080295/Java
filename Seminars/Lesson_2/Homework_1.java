/*
class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder whereClause = new StringBuilder();
        if (!PARAMS.isEmpty()) {
            String[] paramPairs = PARAMS.substring(1, PARAMS.length() - 1).split(",");
            for (int i = 0; i < paramPairs.length; i++) {
                String[] keyValue = paramPairs[i].split(":");
                String key = keyValue[0].replaceAll("\"", "").trim();
                String value = keyValue[1].replaceAll("\"", "").trim();
                if (!value.equals("null")) {
                    if (whereClause.length() > 0) {
                        whereClause.append(" and ");
                    }
                    whereClause.append(key).append("='").append(value).append("'");
                }
            }
        }
        if (whereClause.length() > 0) {
            QUERY += "" + whereClause.toString();
        }
        return new StringBuilder(QUERY);
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Homework_1{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}
*/