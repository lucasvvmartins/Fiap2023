package PK1

interface ChatService {
    import retrofit2.Call
    import retrofit2.http.Body
    import retrofit2.http.POST

    interface ChatService {
        @POST("/enviar_mensagem")
        fun enviarMensagem(@Body mensagem: Mensagem): Call<RespostaMensagem>
    }

}