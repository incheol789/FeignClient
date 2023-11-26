package dev.be.feign.controller;

import dev.be.feign.common.dto.BaseResponseInfo;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/target_server")
@RestController
public class TargetController {

    @GetMapping("/get")
    public BaseResponseInfo demoget(@RequestHeader("CustomHeaderName") String header,
                                    @RequestParam("name") String name,
                                    @RequestParam("age") Long age) {
        return BaseResponseInfo.builder()
                               .header(header)
                               .name(name + " from target server")
                               .age(age)
                               .build();
    }
}
