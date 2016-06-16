package com.candle.platform.events.collector.rest;

import com.candle.platform.events.collector.service.EventRecordingService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by agurha on 16/06/2016.
 */
@RestController
@RequestMapping(value = "/events")
@Api(value = "events", description = "Events Recording API")
public class RecordEventController {


    @Autowired
    private EventRecordingService eventRecordingService;

    @RequestMapping(value = "/{collection_name}",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create an event")
    public void createEvent(@PathVariable("collection_name") String collection_name, @RequestBody String json,
                            HttpServletRequest request, HttpServletResponse response) throws Exception {

        this.eventRecordingService.createEvent(collection_name, json);
    }
}
