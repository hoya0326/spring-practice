package com.ubicom.shop;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;
    private final UsersRepositoy usersRepositoy;
    @GetMapping("/list")
    String list(Model model)
    {
        var user = usersRepositoy.findAll();
        var result = itemRepository.findAll();
        System.out.println(result.get(0).price);
        System.out.println(user.get(0).name);

        model.addAttribute("name", "비싼바지");
        return "list.html";
    }
}
