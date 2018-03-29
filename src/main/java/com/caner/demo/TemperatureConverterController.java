package com.caner.demo;


import com.caner.demo.domain.Temperature;
import com.caner.demo.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class TemperatureConverterController {

    @Autowired
    private ConvertService convertService;

    @ResponseBody
    @RequestMapping(value = "/convert", method = RequestMethod.GET)
    public String getConvertedValue(@RequestParam(value = "from") String from
            , @RequestParam(value = "to") String to
            , @RequestParam(value = "value") double value

    ) {

        Temperature temperature = new Temperature(value, from, to);

        System.out.print(String.valueOf(convertService.getConvertedValue(temperature)));

        return String.valueOf(convertService.getConvertedValue(temperature));


    }


}
