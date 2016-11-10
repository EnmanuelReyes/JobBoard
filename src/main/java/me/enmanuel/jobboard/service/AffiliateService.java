package me.enmanuel.jobboard.service;

import me.enmanuel.jobboard.entity.Affiliate;
import me.enmanuel.jobboard.repository.AffiliateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.util.StringUtils;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 07-Nov-16
 * Time: 2:14 PM
 */
@org.springframework.stereotype.Service
public class AffiliateService implements Service<Affiliate> {


    @Autowired
    AffiliateRepository affiliateRepository;

    @Override
    public Affiliate findOne(Integer var1) {
        return affiliateRepository.findOne(var1);
    }

    @Override
    public <S extends Affiliate> S save(S var1) {
        return affiliateRepository.save(var1);
    }

    @Override
    public void delete(Integer var1) {
        affiliateRepository.delete(var1);

    }

    @Override
    public void delete(Affiliate entity) {
        affiliateRepository.delete(entity);
    }

    @Override
    public Iterable<Affiliate> findAll() {
        return affiliateRepository.findAll();
    }

    public Affiliate activate(Affiliate affiliate) {
        if (StringUtils.isEmptyOrWhitespace(affiliate.getToken())) {
            affiliate.setToken(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 12));
        }
        affiliate.setActive(true);
        return save(affiliate);
    }

    public Affiliate deactivate(Affiliate affiliate) {
        affiliate.setActive(false);
        return save(affiliate);
    }
}