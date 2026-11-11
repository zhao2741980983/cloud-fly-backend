package com.example.cloud_fly_backend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
//import java.util.List;：让代码能用 List
import java.util.List;

@RestController
@RequestMapping("/api")

public class AqiController {
    //AqiRecord：一条城市数据，相当于 { "city": ..., "aqi": ... }。
    @CrossOrigin(origins = {"https://zhao2741980983.github.io", "http://localhost:5173"})
    @GetMapping("/aqi")
    public  List<AqiRecord>getAqi() {
        //List.of(...)：把三条数据放进一个列表返回。Spring 会自动转成 JSON。
        return List.of(
                new AqiRecord("beijing",24),
                new AqiRecord("shanghai",72),
                new AqiRecord("guangzhou",null)
        );
    }
}
