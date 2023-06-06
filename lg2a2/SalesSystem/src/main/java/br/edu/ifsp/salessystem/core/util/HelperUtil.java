package br.edu.ifsp.salessystem.core.util;

import br.edu.ifsp.salessystem.domain.model.util.Category;
import br.edu.ifsp.salessystem.domain.model.util.UF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelperUtil {

    public static Long findZoneCode(String ufCode) {
        return UF.findStateUFEnum(ufCode).getIdZone();
    }


    public double findComissionPercent(Long idCategory) {
        return Category.findCategory(idCategory).getSalesComission();
    }
}
