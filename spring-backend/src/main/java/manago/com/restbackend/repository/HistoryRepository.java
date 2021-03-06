package manago.com.restbackend.repository;

import manago.com.restbackend.model.History;
import manago.com.restbackend.model.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoryRepository extends CrudRepository<History, Long> {
    @Override
    List<History> findAll();
    List<History> findAllByTask(Task task);
}
