package com.corhuila.Parcial.Service;


import com.corhuila.Parcial.Entitity.Nota;
import com.corhuila.Parcial.IRepository.IBaseRepository;
import com.corhuila.Parcial.IRepository.INotaRepository;
import com.corhuila.Parcial.IService.INotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaService extends ABaseService<Nota> implements INotaService {
    @Override
    protected IBaseRepository<Nota, Long> getRepository() {
        return repository;
    }
    @Autowired
    private INotaRepository repository;
}
