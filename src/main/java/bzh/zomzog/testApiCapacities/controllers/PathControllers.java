package bzh.zomzog.testApiCapacities.controllers;

import bzh.zomzog.testApiCapacities.domain.Pony;
import bzh.zomzog.testApiCapacities.domain.PonyExtended;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/path")
public class PathControllers {

    @PostMapping("/v1/ponies")
    public ResponseEntity<Pony> getOne(@RequestBody Pony input) {
        var result = new Pony("path v1 " + input.getName());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/v2/ponies")
    public ResponseEntity<PonyExtended> getOne(@RequestBody PonyExtended input) {
        var result = new PonyExtended("path v2 " + input.getName(), "type " + input.getType());
        return ResponseEntity.ok(result);
    }
}
