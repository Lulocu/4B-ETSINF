/^Host: / {
    printf("Host: %s:%d\r\n", HOST, PORT);
}

/^User-Agent: / {
    printf("User-Agent: %s\r\n", "BobEsponja");
}

! /^Host: / && !/^User-Agent: /{
    print $0;
}



