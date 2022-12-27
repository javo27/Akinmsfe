package com.example.akinms.data.source.remote

import com.example.akinms.data.source.remote.dto.bodega.BodegaDto
import com.example.akinms.data.source.remote.dto.bodega.BodegasDto
import com.example.akinms.data.source.remote.dto.categoria.CategoriasDto
import com.example.akinms.data.source.remote.dto.pedido.*
import com.example.akinms.data.source.remote.dto.producto.ProductDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiRest {
    @GET("productos/listarproductos/bodega/{id}")
    //suspend fun getAllProducts(): List<Products>
    suspend fun getAllProducts(
        @Path("id") id: Long
    ): ProductDto

    @GET("bodegas/listarbodegas/")
    suspend fun getBodegas(): BodegasDto

    @GET("bodegas/listarbodegas/premium")
    suspend fun getBodegasPremium(): BodegasDto

    @GET("bodegas/detalles/{id}")
    suspend fun getBodega(
        @Path("id") id:Long
    ): BodegaDto

    @GET("categorias/bodega/{id}")
    suspend fun getAllCategoriesBodega(
        @Path("id") id: Long
    ): CategoriasDto

    @GET("productos/bodega/{id1}/categoria/{id2}")
    suspend fun getProductsCategoria(
        @Path("id1") id1: Long,
        @Path("id2") id2: Long
    ): ProductDto

    @GET("productos/bodega/{id}/search?")
    suspend fun getProductsByName(
        @Path("id") id: Long,
        @Query("nombre") nombre: String
    ): ProductDto

    @GET("pedidos/consultar/cliente/{id}")
    suspend fun getPedidoByClient(
        @Path("id") id: Long
    ): PedidoDto2

    @POST("pedidos/registrar")
    suspend fun setPedido(
        @Body pedido: Pedido
    ): PedidoDto3

    @GET("pedidos/consultar/cliente/{id_cliente}/pedido/{id_pedido}")
    suspend fun getDetallePedidoCliente(
        @Path("id_cliente") id_cliente: Long,
        @Path("id_pedido") id_pedido: Long
    ): PedidoDto4
}