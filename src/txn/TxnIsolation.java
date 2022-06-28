package txn;

public class TxnIsolation {

    //Txn anamolyies

    //Txn A update Txn B reads before update        dirty read              TXN_READ_UNCOMMITTED TXN_READ_COMMITTED
    //Txn A read Txn B update Txn A read            non-repeatable read     TXN_REPEATABLE_READ
    //Txn A read Txn B insert Txn A read            phantom read            TXN_SERIALIZABLE
}
