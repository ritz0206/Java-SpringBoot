package SpringBoot1.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    @RequestMapping("/")
    public ModelAndView home()
    {
        System.out.println("This is home page");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @PostMapping(value = "/add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j)
    {
        int num3 = i+j;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("result", num3);
        return mv;
    }

    @GetMapping("/getNums")
    public String getNums(Model m)
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        m.addAttribute("nums", nums);
        return " ";
    }

    @ModelAttribute
    public void modelData(Model m)
    {
        m.addAttribute("name", "Rutika");
    }

    /*
    @RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m)
    {
        int num3 = i+j;
        m.addAttribute("num3", num3);
        return "result";
    }
    */

      /*
    @RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m)
    {
        int num3 = i+j;
        m.addAttribute("num3", num3);
        return "result";
    }
    */

     /*
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute("jspname") Alien a, Model m)
    {
        return "result";
    }
    */
}
