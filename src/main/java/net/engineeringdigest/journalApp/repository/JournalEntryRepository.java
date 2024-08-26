package net.engineeringdigest.journalApp.repository;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId>  {
//    MongoRepository takes 2 parameters one is the method we wanna map it will search in collection like saving object or finding object . And another is the id for that document ex-if wanna apply update queries
}
