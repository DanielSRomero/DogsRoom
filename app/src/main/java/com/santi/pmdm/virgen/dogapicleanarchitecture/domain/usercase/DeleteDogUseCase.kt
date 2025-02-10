package com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase;

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao;

import javax.inject.Inject;

class DeleteDogUseCase @Inject constructor(
    private val dogRepositoryDao :DogDao
){

    suspend operator fun invoke(){
        dogRepositoryDao.del
    }
}