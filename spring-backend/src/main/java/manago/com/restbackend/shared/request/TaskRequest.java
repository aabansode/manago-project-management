package manago.com.restbackend.shared.request;

import lombok.Data;

import java.util.Set;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskRequest {
    private String name;
    private Long parentId;
    private Set<TaskRequest> subTaskRequests;
    private StatusRequest statusRequest;
}
