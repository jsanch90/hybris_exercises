package de.hybris.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.commerceservices.request.mapping.annotation.ApiVersion;
import de.hybris.training.storefront.forms.MyCreationDateForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping(value = "/creation-date")
public class CreationDateController extends AbstractPageController {

    @RequestMapping(value = "/", method= RequestMethod.POST, produces = "text/plain")
    @ResponseBody
    public String updateCreationDate(final MyCreationDateForm myCreationDateForm){
        return myCreationDateForm.getMyCreationDateFormInput().toString();
    }
}
