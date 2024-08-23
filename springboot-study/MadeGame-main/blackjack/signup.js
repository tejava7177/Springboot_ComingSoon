function signup() {
    // 사용자 입력 정보 가져오기
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // 입력값 유효성 검사 (예시)
    if (!username || !password) {
        alert('모든 항목을 입력해주세요.');
        return;
    }

    // 백엔드로 회원가입 요청 (Fetch API 사용 예시)
    fetch('http://localhost:8080/api/blackjack/signup', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username, password })
    })
    .then(response => response.json())
    .then(data => {
        if (data.success) {
            alert('회원가입 성공!');
            // 회원가입 성공 후 처리 (예: 로그인 페이지 이동)
        } else {
            alert('회원가입 실패: ' + data.message);
        }
    })
    .catch(error => {
        console.error('Error:', error);
        alert('회원가입 중 오류가 발생했습니다.');
    });
}