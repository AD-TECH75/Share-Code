const page = ({ params }) => {
    console.log(params)
    return (
        <>
            <h1>pencarian untuk {params.keyword}</h1>
            <p>ini adalah search page</p>
        </>
    )
}

export default page