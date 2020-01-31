package com.ormco.interview.api;

import com.ormco.interview.domain.Client;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/doctors")
    public List<Client> getDoctors(
        @RequestParam(required = false) Double minTradesTotal,
        @RequestParam(required = false) Double maxTradesTotal) {

        // not implemented
        return null;
    }
}
