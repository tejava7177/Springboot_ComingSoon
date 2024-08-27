function clickbutton() {
    const textboxValue = document.getElementById("textbox").value;

    if (textboxValue.trim() === "") {
        alert("Textbox cannot be empty");
        return;
    }

    // 로딩 표시 (예: 스피너 표시)
    //showLoadingIndicator();

    fetch('http://localhost:8080/api/saveText', {
        method: 'POST',
        mode: 'cors',
        credentials: 'include', // 여기를 추가
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ text: textboxValue })
    })
    .then(response => {
        if (!response.ok) {
            throw new Error(`Network response was not ok: ${response.statusText}`);
        }
        return response.json();
    })
    .then(data => {
        // 성공적으로 저장되었을 때의 처리
        console.log('Success:', data);
        alert("Text saved successfully");
        // 사용자 인터페이스 업데이트 (예: 성공 메시지 표시)
    })
    .catch((error) => {
        console.error('Error:', error);
        alert("Failed to save text. Please try again later.");
        // 사용자 인터페이스 업데이트 (예: 에러 메시지 표시, 재시도 버튼 제공)
    })
    .finally(() => {
        // 로딩 표시 제거
        //hideLoadingIndicator();
    });
}