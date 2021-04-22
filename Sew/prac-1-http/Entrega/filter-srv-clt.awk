/^Date: / {
    printf("Date: %s\r\n", DATE);
}


! /^Date: / {
    print $0;
}



