`grep` Exercise
===============

Using the file grepdata.txt, write a series of grep statements that do the following:

Print all lines that contain a phone number with an extension (the letter x or X followed by four digits).
Print all lines that begin with three digits followed by a blank. Your answer must use the \{ and \} repetition specifier.
Print all lines that contain a date. Hint: this is a very simple pattern. It does not have to work for any year before 2000.
Print all lines containing a vowel (a, e, i, o, or u) followed by a single character followed by the same vowel again. Thus, it will find “eve” or “adam” but not “vera”. Hint: \( and \)
Print all lines that do not begin with a capital S.
Write grep statements that use command-line options along with the pattern to do the following:

Print all lines that contain CA in either uppercase or lowercase.
Print all lines that contain an email address (they have an @ in them), preceded by the line number.
Print all lines that do not contain the word Sep. (including the period).
Print all lines that contain the word de as a whole word.

Save these statements in a file and show it to me.

Your patterns should work in any generic file of this sort. They should not be dependent upon the data in this particular file; if I add more lines of the same form to the file, your patterns should still work.
