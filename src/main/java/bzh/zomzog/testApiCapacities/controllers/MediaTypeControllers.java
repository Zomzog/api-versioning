package bzh.zomzog.testApiCapacities.controllers;

import bzh.zomzog.testApiCapacities.domain.Pony;
import bzh.zomzog.testApiCapacities.domain.PonyExtended;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mediaType")
public class MediaTypeControllers {

    @PostMapping(value = "/ponies", consumes = {"application/bzh.zomzog.v1+json"})
    public ResponseEntity<Pony> getOne(@RequestBody Pony input) {
        var result = new Pony("header v1 " + input.getName());
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/ponies", consumes = {"application/json", "application/bzh.zomzog.v2+json"})
    public ResponseEntity<PonyExtended> getOne(@RequestBody PonyExtended input) {
        var result = new PonyExtended("header v2 " + input.getName(), "type " + input.getType());
        return ResponseEntity.ok(result);
    }
}
