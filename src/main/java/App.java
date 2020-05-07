import spark.ModelAndView;

import java.util.HashMap;
import java.util.Map;

public class App {
    ProcessBuilder process = new ProcessBuilder();
    Integer port;

        if (process.environment().get("PORT") != null) {
        port = Integer.parseInt(process.environment().get("PORT"));
    } else {
        port = 4567;
    }

    port(port);
    staticFileLocation("/public");
    get("/", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        return new ModelAndView(model, "index.hbs");
    }, new HandlebarsTemplateEngine());

}
