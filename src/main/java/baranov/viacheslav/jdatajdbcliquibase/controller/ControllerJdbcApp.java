package baranov.viacheslav.jdatajdbcliquibase.controller;

import baranov.viacheslav.jdatajdbcliquibase.repository.RepositoryJdbcApp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerJdbcApp {
    private final RepositoryJdbcApp repositoryJdbcApp;

    public ControllerJdbcApp(RepositoryJdbcApp repositoryJdbcApp) {
        this.repositoryJdbcApp = repositoryJdbcApp;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam("name") String name) {
        return repositoryJdbcApp.getProductName(name);
    }
}
