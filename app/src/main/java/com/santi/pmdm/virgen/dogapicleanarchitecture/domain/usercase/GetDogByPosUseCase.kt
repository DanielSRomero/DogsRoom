package com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.repository.DogRepository
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog
import javax.inject.Inject

class GetDogByPosUseCase @Inject constructor(
    private val dogRepositoryDao : DogRepository
){

    suspend operator fun invoke(pos : Int) : Dog?{
        return dogRepositoryDao.getDogBreedByPos(pos)
    }
}