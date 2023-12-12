package com.example.demo.recipeapi.api;

import com.example.demo.recipeapi.dto.recipeListResponseDTO;
import com.example.demo.recipeapi.service.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/recipe")
@CrossOrigin
public class RecipeController {

    private final RecipeService recipeService;


    // 레시피 리스트 요청 처리
    @GetMapping
    public ResponseEntity<?> getRecipeList(){
        log.info("/api/recipe GET Recipe List Request");
        String responseDTO = recipeService.getRecipeList();

        return ResponseEntity.ok().body(responseDTO);
    }

    // 레시피 상세보기 요청 처리
    @GetMapping("/{id}")
    public ResponseEntity<?> getRecipe(@PathVariable String id){
        log.info("/api/recipe/id GET Recipe Detail Request");
        String responseDTO = recipeService.getRecipe(id);


        return ResponseEntity.ok().body(responseDTO);

    }






}
