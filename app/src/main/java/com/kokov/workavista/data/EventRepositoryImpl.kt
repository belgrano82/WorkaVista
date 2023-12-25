import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kokov.workavista.domain.models.Attachment
import com.kokov.workavista.domain.models.AttachmentType
import com.kokov.workavista.domain.models.Event
import com.kokov.workavista.domain.models.EventType
import com.kokov.workavista.domain.repositories.EventRepository
import java.time.LocalDateTime

class EventRepositoryImpl : EventRepository {

     var events = listOf<Event>()

    private val names = listOf<String>("Marta", "John", "Alex", "Nick", "Jane")
    private val surnames = listOf<String>("Smith", "Brown", "Tramp", "King", "Miller")
    private val numbers = IntArray(1001) {it}

    init {
        for (i in 0 until 100) {
            val event = Event(
                id = i,
                authorId = i + 10,
                authorAvatar = "sampledata/avatar.jpg",
                author = "${names.random()} ${surnames.random()}",
                content = "event # $i",
                likedByMe = false,
                attachment = Attachment("", type = AttachmentType.entries.random()),
                likes = numbers.random(),
                published = LocalDateTime.now(),
                link = "",
                shares = numbers.random(),
                type = EventType.entries.random(),
                authorJob = "",
                coordinates = null,
                dateTime = LocalDateTime.now(),
                likeOwnerIds = null,
                participantsIds = null,
                speakersIds = null,
                participatedByMe = false,
                users = null

            )
            events += event
        }
    }

    private val data = MutableLiveData(events)

    override fun getAllEvents(): LiveData<List<Event>> = data

}