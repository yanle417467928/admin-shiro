package com.yanle.controller;/**
 * Created by lenovo on 2016-11-24.
 */

import com.yanle.commons.base.BaseController;
import com.yanle.commons.utils.DigestUtils;
import com.yanle.commons.utils.PageInfo;
import com.yanle.commons.utils.StringUtils;
import com.yanle.pojo.User;
import com.yanle.pojo.vo.UserVo;
import com.yanle.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户 controller
 *
 * @author
 * @create 2016-11-24 13:59
 **/
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    /**
     * 用户管理首页
     */
    @RequestMapping(value = "/manager",method = RequestMethod.GET)
    public String manager(){
        return "admin/user";
    }

    /**
     * 用户管理列表
     *
     * @param userVo
     * @param page
     * @param rows
     * @param sort
     * @param order
     * @return
     */
    @RequestMapping(value = "dataGrid",method = RequestMethod.POST)
    @ResponseBody
    public Object dataGrid(UserVo userVo,Integer page,Integer rows,String sort,String order){
        PageInfo pageInfo = new PageInfo(page,rows);
        Map<String,Object> condition = new HashMap<String,Object>();

        if(StringUtils.isNotBlank(userVo.getName())){
            condition.put("name",userVo.getName());
        }
        if (userVo.getOrganizationId()!=null){
            condition.put("organizationId",userVo.getOrganizationId());
        }
        if (userVo.getCreatedateStart()!=null){
            condition.put("startTime",userVo.getCreatedateStart());
        }
        if (userVo.getCreatedateEnd()!=null){
            condition.put("endTime",userVo.getCreatedateEnd());
        }
        pageInfo.setCondition(condition);
        userService.selectDataGrid(pageInfo);
        return pageInfo;

    }

    /**
     * 添加用户页
     *
     * @return
     */
    @RequestMapping(value = "/addPage", method = RequestMethod.GET)
    public String addPage() {
        return "admin/userAdd";
    }

    /**
     * 添加用户
     *
     * @param userVo
     * @return
     */
    @RequestMapping(value ="/add",method = RequestMethod.POST)
    @ResponseBody
    public Object add(UserVo userVo){
        User u = userService.selectByLoginName(userVo.getLoginName());
        if (u!=null){
            return renderError("用户名已存在!");
        }
        userVo.setPassword(DigestUtils.md5Hex(userVo.getPassword()));
        userService.insertByVo(userVo);
        return renderSuccess("添加成功");
    }


}
