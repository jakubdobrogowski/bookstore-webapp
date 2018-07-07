package pl.sda.bookstorewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller //singleton
public class OnlyOneController {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {

        return "index";
    }

    @GetMapping("/cats")
    public String cats(Map<String, Object> model, @RequestParam(required = false) String searchText) {
        SearchCategoriesService searchCategoriesService = new SearchCategoriesService();
        List<AdminCategoryDTO> categoryDtoList = searchCategoriesService.filterCategories(searchText);
        model.put("catsdata", categoryDtoList);
        return "cats";
    }
}
