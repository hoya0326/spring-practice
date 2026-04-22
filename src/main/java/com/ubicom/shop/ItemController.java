package com.ubicom.shop;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;
    private final UsersRepositoy usersRepositoy;
    @GetMapping("/list")
    String list(Model model)
    {
        List<Users> user = usersRepositoy.findAll();
        var result = itemRepository.findAll();
        var a = new Users();
        System.out.println(result.get(0).price);
        System.out.println(user.get(0).name);
        System.out.println(a.toString());
        model.addAttribute("name", "비싼바지");
        model.addAttribute("user", user);
        return "list.html";
    }
}
