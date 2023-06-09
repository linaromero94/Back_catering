/*package com.example.backend.catering.util;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MapperUtil {
    @Autowired
    ModelMapper modelMapper;
    public <D,T>D map(final T entity, Class <D> outClass){
        return modelMapper.map(entity,outClass);
    }

    public <D,T>List <D> mapAll(final Collection<T> entityList, Class <D> outClass){
        return entityList.stream().map(entity -> map(entity, outClass))
        .collect(Collectors.toList());
    }
            public <D,T> Page<D> mapEntityPageIntoDtoPage(Page<T> entities, Class<D> dtoClass){
     return entities.map(objectEntity -> modelMapper.map(objectEntity,dtoClass));
            }
}
*/