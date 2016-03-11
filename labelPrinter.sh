#!/usr/bin/env bash
  javac -cp "src" -d out src/InvitationMain.java -Xlint && cd ./out/ && java InvitationMain $1 $2 $3 $4