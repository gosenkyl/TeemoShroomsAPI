package com.teemo.shrooms.resource;

import com.teemo.shrooms.dso.ReferenceData;
import com.teemo.shrooms.service.ReferenceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reference-datas")
@CrossOrigin
public class ReferenceDataResource {

    @Autowired
    private ReferenceDataService referenceDataService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ReferenceData> getAllReferenceDatas(){
        return referenceDataService.findAll();
    }

    @RequestMapping(value = "{referenceDataId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ReferenceData getReferenceDataById(@PathVariable String referenceDataId){
        return referenceDataService.findById(referenceDataId);
    }

    @RequestMapping(value = "set/{setId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ReferenceData> getReferenceDataBySetId(@PathVariable String setId){
        return referenceDataService.getReferenceDataBySetId(setId);
    }
}
