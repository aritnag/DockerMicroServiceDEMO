package com.aws.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller
public class TodoDemoController {

    @Autowired
    private TodoItemRepository repository;

    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<TodoItem> todoList = (ArrayList<TodoItem>) repository.findAll();
        //model.addAttribute("items", todoList);
        model.addAttribute("newitem", new TodoItem());
        model.addAttribute("items", new TodoListViewModel(todoList));
        return "index";
    }

    @RequestMapping("/add")
    public String addTodo(@ModelAttribute TodoItem requestItem) {
        TodoItem item = new TodoItem(requestItem.getTimeline(),requestItem.getType(),requestItem.getComplexity(), requestItem.getName());
        repository.save(item);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String updateTodo(@ModelAttribute TodoListViewModel requestItems,
    @RequestParam(value="action", required=false)String action){
        return "redirect:/";
    }
}
