package com.breezefieldsalesprolific.features.newcollection.model

import com.breezefieldsalesprolific.app.domain.CollectionDetailsEntity
import com.breezefieldsalesprolific.base.BaseResponse
import com.breezefieldsalesprolific.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}