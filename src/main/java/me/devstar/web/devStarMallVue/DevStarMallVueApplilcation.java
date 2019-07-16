package me.devstar.web.devStarMallVue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.devstar.common.entity.SearchForm;


@Controller
@RequestMapping(DevStarMallVueApplilcation.REQUEST_MAPPING_PREFIX)
public class DevStarMallVueApplilcation {
	
	public static final String REQUEST_MAPPING_PREFIX = "/";
	
	@GetMapping
	public String index(Model model, final SearchForm searchForm) {
		return "index";
	}
	
	@GetMapping("/vuetest01")
	public String vuetest01(Model model, final SearchForm searchForm) {
		return "vuetest01";
	}
	
	
	@GetMapping("/vuetest02")
	public String vuetest02(Model model, final SearchForm searchForm) {
		return "vuetest02";
	}


}
