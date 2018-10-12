package cn.smileyan.springboot.smileyan_idiom.controller;

import cn.smileyan.springboot.smileyan_idiom.entity.Cy;
import cn.smileyan.springboot.smileyan_idiom.service.CyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CyController {
    @Autowired
    private CyService cyService;

    @GetMapping("/findbyid")
    private Cy getCyById(Integer cyid){
        return cyService.getCyById(cyid);
    }

    @GetMapping("/findbyname")
    private Cy getCyByName(String name){
        return cyService.getCyByName(name);
    }

    @GetMapping("/findbyheadstrictly")
    private Map<String,Object> getCyByHeadStrictly(
                        @RequestParam("h") String headname,
                        @RequestParam("s") int start,
                        @RequestParam("l") int length){
        System.out.println("h=="+headname+"\ns=="+start+"\nl=="+length);
        List<Cy> cyByHeadName = cyService.getCyByHeadNameStrictly(headname, start, length);
        Map<String,Object> map=new HashMap<>();
        if(cyByHeadName.size()>0) {
            map.put("success_list", cyByHeadName);
        }else{
            map.put("error_blank",null);
        }
        return map;
    }

    @GetMapping("/findbyhead")
    private Map<String,Object> getCyByHead(
            @RequestParam("h") String headname,
            @RequestParam("s") int start,
            @RequestParam("l") int length){
        List<Cy> cyByHeadName = cyService.getCyByHeadName(headname, start, length);
        Map<String,Object> map=new HashMap<>();
        if(cyByHeadName.size()>0) {
            map.put("success_list", cyByHeadName);
        }else{
            map.put("error_blank",null);
        }
        return map;
    }

}
