package com.mkyong;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeteoController {
	// inject via application.properties
	@Value("${meteo.message:test}")
	/* private String message = dnes /*"Hello World";*/
        private String dnes = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        // to je raketa
	@RequestMapping("/")
	public String meteo(Map<String, Object> model) {
		model.put("Dnes je: ", this.dnes);
		return "meteo";
	}
}