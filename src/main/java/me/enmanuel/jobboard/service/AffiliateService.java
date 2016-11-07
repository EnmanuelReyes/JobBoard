package me.enmanuel.jobboard.service;

import me.enmanuel.jobboard.entity.Affiliate;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel Reyes
 * Date: 07-Nov-16
 * Time: 2:14 PM
 */
@org.springframework.stereotype.Service
public class AffiliateService implements Service<Affiliate> {


    @Override
    public Affiliate findOne(Integer var1) {
        return null;
    }

    @Override
    public <S extends Affiliate> S save(S var1) {
        return null;
    }

    @Override
    public void delete(Integer var1) {

    }

    @Override
    public void delete(Affiliate entity) {

    }

    @Override
    public Iterable<Affiliate> findAll() {
        return null;
    }

    public Affiliate activate(Affiliate affiliate) {
        affiliate.setActive(true);
        return save(affiliate);
    }

    public Affiliate deactivate(Affiliate affiliate) {
        affiliate.setActive(false);
        return save(affiliate);
    }
}