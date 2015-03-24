package springapp.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springapp.service.PriceIncrease;
import springapp.service.ProductManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.SimpleFormatter;

/**
 * Created by huifeng.hxl on 2015/3/1.
 */
@RequestMapping("/priceincrease.htm")
@Controller
public class PriceIncreaseFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private ProductManager productManager;

    @RequestMapping(value = "/priceincrease.htm", method = RequestMethod.POST)
    public String create(
            @ModelAttribute("priceIncrease") final PriceIncrease priceIncrease) {

        int increase = priceIncrease.getPercentage();
        logger.info("Increasing prices by " + increase + "%.");

        productManager.increasePrice(increase);

        logger.info("returning from PriceIncreaseForm view to hello.htm");

        return "hello";
    }

    @RequestMapping(value = "/priceincrease.htm", method = RequestMethod.GET)
    public ModelAndView creatForm() {
        logger.info("Returning form view with");

        Map<String, Object> myModel = new HashMap<String, Object>();
        return new ModelAndView("priceincrease", "model", myModel);
    }

//    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
//        PriceIncrease priceIncrease = new PriceIncrease();
//        priceIncrease.setPercentage(20);
//        return priceIncrease;
//    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    public ProductManager getProductManager() {
        return productManager;
    }

}
