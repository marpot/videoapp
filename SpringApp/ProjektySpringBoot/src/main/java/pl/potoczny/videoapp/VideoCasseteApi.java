package pl.potoczny.videoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
// siema sda
@RestController
@RequestMapping("/api/cassets/")
public class VideoCasseteApi {

    private List<VideoCassette> videoCassetes;

    public VideoCasseteApi() {
        videoCassetes = new ArrayList<>();
        videoCassetes.add(new VideoCassette(1L, "Titanic", LocalDate.of(1995, 1, 1)));
        videoCassetes.add(new VideoCassette(1L, "Pulp Fiction", LocalDate.of(1990, 2, 2)));
    }

    @GetMapping("/all")
    public List<VideoCassette> getAll() {
        return videoCassetes;
    }

    @GetMapping
    public List<VideoCassette> getById(@RequestParam int index) {
        Optional<VideoCassette> first = videoCassetes.stream().filter(element -> element.getId()==index).findFirst();
      return (List<VideoCassette>) first.get();
    }


}
