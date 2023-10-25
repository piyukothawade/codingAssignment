const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function reverseWordsInSentence(sentence) {
    let reversedSentence = '';
    let word = '';

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] !== ' ') {  
            word = sentence[i] + word;  
        } else {
            reversedSentence += word + ' ';
            word = '';
        }
    }

    reversedSentence += word;
    return reversedSentence;
}

rl.question('Enter the sentence: ', function(sentence) {
    const result = reverseWordsInSentence(sentence);
    console.log(result);  
    rl.close();
});
