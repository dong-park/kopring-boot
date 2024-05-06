package land.dongpark.dongpringboot.api

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/greeting")
class GreetingController {

    @GetMapping("")
    fun greeting(): ResponseEntity<*> {
        return ResponseEntity.status(HttpStatus.OK).build<Any>()
    }


}
